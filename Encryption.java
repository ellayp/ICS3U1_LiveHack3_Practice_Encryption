class Encryption extends ConsoleProgram {

  /**
  * A program the encrypts a message inputted by the user
  * @author: E. Yap
  */

  public void run() {
    // Declare variables
    String strMessageToEncrypt;
    int intShiftAmount;
    String strEncryption;
    // String strResult;
    // int i = 0;


    // Output header
    System.out.println ("**** Encryption Program *****");

    // Get user input
    strMessageToEncrypt = readLine ("Enter the message to encrypt: ");
    intShiftAmount = readInt ("Enter the shift amount: ");

    // Encrypt the message
    strEncryption = encryptMessage (strMessageToEncrypt, intShiftAmount);

    // Output
    System.out.println ("Here is your encrypted message: " + strEncryption);
  }
  //   for (i = 0; i < strMessageToEncrypt.length() - 1; i++) {
  //     (char)(char + ((strMessageToEncrypt.charAt(i) - char + intShiftAmount) % 95));
  //     strResult +=;

  /**
   * 
   * @param strMessageToEncrypt string to encrypt
   * @param intShiftAmount how much to shift the message by
   * @throws shift is less than 1
   * @return the encrypted message
   */
  private String encryptMessage(String strMessageToEncrypt, int intShiftAmount) {
    // Limits shift value in the encryptMessage() method 
    // such that an exception will be thrown if the shift is less than 1.
    if (intShiftAmount < 1) {
      throw new IllegalArgumentException ("Illegal shift value. Shift must be greater than 1.");
    }

    // Declare variable
    String result = "";

    // Loop message and shift each character
    for (int i = 0; i < strMessageToEncrypt.length(); i++) {
      result += (char)(' ' + ((strMessageToEncrypt.charAt(i) - ' ' + intShiftAmount) % 95));
    }

    // Return result
    return result;
  }
}
