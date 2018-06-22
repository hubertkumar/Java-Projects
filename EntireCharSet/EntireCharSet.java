class EntireCharSet {
    public static void main(String args[]){
    char unicodeChar, firstChar = 0b0000_0000_0000_0000, lastChar = 0b1111_1111_1111_1111;

    System.out.println("This class prints evrey single possible character in the UniCode Charset");
    System.out.println("The bit column values are: 32768|16384|8192|4096|2048|1024|512|256|128|64|32|16|8|4|2|1");

    unicodeChar = firstChar;
    //for(int i=0; i<=lastChar; i++){
    for(int i=0; i<=256; i++){
       if(i == 0) System.out.println("i=" + i);
       //if((i % 16) != 0) System.out.print("i=" + i);
       System.out.print(unicodeChar++ + "; ");
    }
  }
}











