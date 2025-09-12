/*
Imagine you have a playlist of songs that you want to listen to. The songs are arranged in the order they were added to the playlist. Sometimes, you want to reverse the order of the playlist to listen to your favourite songs in the opposite order. This task can be represented using a singly linked list, where each node contains a song.

Your task is to reverse the playlist so that you can listen to the songs in the opposite order.

Input Format

The first line contains an integer n, representing the number of songs in the playlist. The next n lines each contain a string, representing the name of a song.

Output Format

The output will be a single line containing the names of the songs in reverse order, separated by spaces.

Sample Input 0

Song1
Song2
Song3
Song4
Song5
Sample Output 0

Song5 Song4 Song3 Song2 Song1
Explanation 0

Input Playlist

You have a playlist with songs ordered from Song1 to Song5.

Reversing Process

You start at the head of the playlist (Song1) and begin to change the direction of the links between the songs.

After reversing, Song1 will point to null (as it becomes the last song), and the order will change so that Song5 becomes the first song in the playlist.

Final Output

You get the new playlist in the order you desire, from Song5 down to Song1.
*/

import java.io.*;
import java.util.*;
class Node{
    String str;
    Node next;
    Node(String str){
        this.str=str;
        next=null;
    }
}
class ll{
    Node head=null;
    Node old=null;
    void ins(String str){
        Node nn=new Node(str);
        if(head==null){
            head=nn;
            old=nn;
        }else{
            old.next=nn;
            old=nn;
        }
    }
    void disp(){
        Node prev=null;
        Node safety=null;
        Node current=head;
         while(current!=null){
            safety=current.next;
            current.next=prev;
            prev=current;
            current=safety;
        }
        while(prev!=null){
            System.out.print(prev.str+" ");
            prev=prev.next;
        }
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll new_node=new ll();
        while(sc.hasNext()){
            String str=sc.next();
            new_node.ins(str);
        }
        new_node.disp();
    }
}
