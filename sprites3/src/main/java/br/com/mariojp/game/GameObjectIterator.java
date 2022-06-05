package br.com.mariojp.game;

import java.util.ArrayList;
import java.util.List;

public class GameObjectIterator<E> implements Iterator{

    ArrayList<E> objects;
    int pos =  0;

    public GameObjectIterator(ArrayList<E> objeto) {
        this.objects = objeto;
    }

    @Override
    public boolean hasNext() {
        if(pos >= objects.size() || objects.get(pos) == null) {
            return false;
        }else {
            return true;
        }

    }

    @Override
    public Object next() {
        Object object = objects.get(pos);
        pos++;
        return object;

    }

}