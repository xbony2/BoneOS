package ibittech.boneos.system.java;

public enum ShutdownStatus {
	NORMAL,
	ERROR;
	
	public static void shutDown(ShutdownStatus status){
		switch(status){
		case ERROR: 
			System.out.println("BoneOS has experienced an error! Shutting down!");
			System.exit(-1);
		case NORMAL: 
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------BoneOS shutting down..---------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
			System.exit(0);
		default:
			System.out.println("BoneOS has experienced an error! Shutting down!");
			System.exit(-1);
		}
	}
}
