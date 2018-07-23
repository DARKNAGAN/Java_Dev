package generique;

public class Pair<K, V> {
	// G�rer une paire cl� - valeur (ayant chacune un type g�n�rique)
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}