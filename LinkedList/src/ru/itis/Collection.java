package ru.itis;

public interface Collection<T> {
    void add(T element);
    void remove(T element);
    boolean contains(T element);
}
