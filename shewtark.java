
		package com.arraydemo;
		//array object
		class UserDefinedType
		{
		int i;
			
			public void method1()
			{
				System.out.println("from user defined type of object");
			}
		}


		public class ArrayObjectDemo {

			
			public static void main(String[] args) {
				int[] a;
				int a1[];
				//UserDefinedType object=new UserDefinedType();// simple object 
				UserDefinedType[] userDefineArray=new UserDefinedType[10]; // array type of object
			
				userDefineArray[0]=object1;
				userDefineArray[1]=object2;
				userDefineArray[2]=object3;
				userDefineArray[3]=object4;
				userDefineArray[4]=object5;
				userDefineArray[5]=object6;
				
				
				
				for(int i=0; i< userDefineArray.length; i++ )
				{
				userDefineArray[i]=new UserDefinedType();
				}
				userDefineArray[1].method1();
			}

		}
	}

}
