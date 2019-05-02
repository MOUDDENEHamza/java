package CC1;

public interface ICollection<E> {
    /**
     * ajoute un élément en queue de collection
     *
     * @param e référence de l'élément à ajouter
     */
    public void add(E e);

    /**
     * enleve l'élément en tête de collection si la collection n'est pas vide
     *
     * @throws RuntimeException exception levée si la collection est vide
     */
    public void removeFirst();

    /**
     * enleve l'élément en queue de collection si la collection n'est pas vide
     *
     * @throws RuntimeException exception levée si la collection est vide
     */
    public void removeLast();

    /**
     * indique si la collection est vide
     *
     * @return true si vide, false sinon
     */
    public boolean isEmpty();

    /**
     * retourne le nombre d'éléments stockés dans la collection
     *
     * @return taille effective de la collection
     */
    public int size();

    /**
     * retourne la référence de l'élément en tête de collection
     * si la collection n'est pas vide, sans l'enlever de la collection
     *
     * @return référence de l'élément en tête de collection
     * @throws RuntimeException exception levée si la collection est vide
     */
    public E getFirst();

    /**
     * retourne la référence de l'élément en queue de collection
     * si la collection n'est pas vide, sans l'enlever de la collection
     *
     * @return référence de l'élément en tête de collection
     * @throws RuntimeException exception levée si la collection est vide
     */
    public E getLast();
}
