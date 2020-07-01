package openClosePrincip.interfaces;

public interface Specification<T>{
    boolean isSatisfied(T item);
}
