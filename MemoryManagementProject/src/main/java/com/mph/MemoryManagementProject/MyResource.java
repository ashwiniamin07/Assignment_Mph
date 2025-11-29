package com.mph.MemoryManagementProject;

public class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Resource closed");

	}
	public static void main(String[] args) throws Exception {
		MyResource rs=getResource();
		System.out.println(rs.hashCode());
		System.out.println("requesting gc");
		System.gc();
		
	}
	public static  MyResource getResource() throws Exception {
		try(MyResource resource=new MyResource();){
			System.out.println("Resource using");
			return resource;
		}
	}

}
