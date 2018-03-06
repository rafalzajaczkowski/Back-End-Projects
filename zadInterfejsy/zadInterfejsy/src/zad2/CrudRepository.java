package zad2;


public interface CrudRepository<T> {
    T findFirst();
}
