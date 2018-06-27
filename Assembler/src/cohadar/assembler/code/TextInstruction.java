package cohadar.assembler.code;

abstract class TextInstruction implements TextLine {
	final int sourceLine;
	final String mnemonic;

	public TextInstruction(int sourceLine, String mnemonic) {
		this.sourceLine = sourceLine;
		this.mnemonic = mnemonic;
	}
}
