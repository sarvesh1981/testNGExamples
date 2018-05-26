package com.practice.java.testngEx.testNGPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Factory;

@Test
public class TestngExWithDataprovider {
	
	String excelFilePath = "C:\\Users\\sarvsinh\\Documents\\UserData.xlsx";
	int sheetNo=0;
	@DataProvider(name = "userLogin",parallel=true)
	public Object[][] getUserInfo() throws InvalidFormatException {
		//return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@123" },{ "testuser_3", "Test@123" },{ "testuser_4", "Test@123" }};
		Object userData[][] =getUserData.getData(excelFilePath,sheetNo);
		return userData;
	}	

	/*@Test(dataProvider="userLogin")
	public void getUserDetail(String uName,String pawd) {
		System.out.println("---------------------------------");
		System.out.println("Method uName= "+uName+", Method password="+pawd);
	}*/
	
	@Factory(dataProvider="userLogin")
	public Object[] loginApp(String user,String pwd) {
		
		return new Object[] {new ClassCreatedByFactoryWithInputData(user,pwd)};
	}
}

class getUserData{	
	public static Object[][] getData(String excelFilePath,int sheetNo) throws InvalidFormatException {
		Object[][] userInfo=null;
		 try {
			 FileInputStream excelFile = new FileInputStream(new File(excelFilePath));	        
			 XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	            Sheet datatypeSheet = workbook.getSheetAt(sheetNo);
	           // System.out.println(datatypeSheet.getLastRowNum());
	            int arraySize=datatypeSheet.getLastRowNum();
	            userInfo=new Object[arraySize][2];
	            Iterator<Row> iterator = datatypeSheet.iterator();
	           int i=0;
	           NoIncrement:
	        	   while (iterator.hasNext()) {
	            	int j=-1;
	                Row currentRow = iterator.next();
	                Iterator<Cell> cellIterator = currentRow.iterator();

	                while (cellIterator.hasNext()) {	                	
	                    Cell currentCell = cellIterator.next();
	                    if(currentCell.getRowIndex()==0)
	                    	continue NoIncrement;
	                    j++;
	                  //System.out.println(currentCell);
	                    if(currentCell!=null)
	                  userInfo[i][j]=currentCell;
	                }
	                i++;
	                System.out.println();

	            }
	            
	         /*  for(int k=0;k<userInfo.length;k++) {
	        	   for(int l=0;l<2;l++) {
	            	System.out.print(userInfo[k][l]);
	            	System.out.print(", ");
	        	   }
	        	   System.out.println("");
	            }*/
	           
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
      return userInfo;
	}
}
