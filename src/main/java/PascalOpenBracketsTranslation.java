public class PascalOpenBracketsTranslation implements ITranslator {
    @Override
    public Tuple tokenize(String[] string, int count) {
        if (!string[count].equals("Begin"))
            return null;
        var tokenOpenBracket = new Token();
        tokenOpenBracket.nameTranslator = "open bracket";
        count++;
        return new Tuple(tokenOpenBracket, count);
    }
}
