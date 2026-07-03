package com.data.structures.array;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node{
        int key, value;
        Node next,prev;
        public Node(int key, int value){
            this.key=key;
            this .value=value;
        }
    }

    private int capacity;
    private Map<Integer,Node> map;
    private Node head;
    private Node tail;

    public LRUCache(){
        capacity=2;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        remove(node);
        insert(node);
        return map.get(key).value;
    }

    public  void insert(Node node){
       node.next=head.next;
       node.prev=head;

       head.next.prev=node;
       head.next=node;
    }

    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            Node lru=tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
        Node newNode=new Node(key, value);
        insert(newNode);
        map.put(key,newNode);
    }


    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache();
        lruCache.put(1,5);
        lruCache.put(2,10);
        System.out.println(lruCache.get(1));
        lruCache.put(3,6);
        System.out.println(lruCache.get(2));
    }

}
