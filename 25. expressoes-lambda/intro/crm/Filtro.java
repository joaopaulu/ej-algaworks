package intro.crm;

@FunctionalInterface
public interface Filtro<T> {

	boolean avaliar(T objeto);

}
