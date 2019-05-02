package CT2018SESSION1;

public interface IDico {
    /**
     * Recherche la présence d'un mot dans un dictionnaire
     *
     * @param word mot à rechercher
     * @return true si trouvé, false sinon
     */
    public boolean containsWords(String word);

    /**
     * Insère un mot dans le dictionnaire si non déjà présent
     *
     * @param word mot à insérer
     * @throws Exception exception si le mot est déjà présent
     */
    public void addWord(String word) throws Exception;
}