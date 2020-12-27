public class PascalCloseBracketsTranslation implements ITranslator {
    @Override
    public Tuple tokenize(String[] string, int count) {
        if (string[count].equals("end;")) {
            count++;
            var tokenCloseBrackets = new Token();
            tokenCloseBrackets.nameTranslator = "close bracket";
            return new Tuple(tokenCloseBrackets, count);
        }
        return null;
    }
}
