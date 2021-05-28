public class Buffer {
	public static void main(String[] args) {
		System.out.println("Byte:"+Byte.parseByte(args[0]));
		System.out.println("Short:"+Short.parseShort(args[0]));
		System.out.println("Integer:"+Integer.parseInt(args[0]));
		System.out.println("Long:"+Long.parseLong(args[0]));
		System.out.println("Float:"+Float.parseFloat(args[0]));
		System.out.println("Double:"+Double.parseDouble(args[0]));
		System.out.println("Character:"+args[0].charAt(0));
	}

}
