/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lifeislife;

/**
 *
 * @author m1kc
 */
public class Animal
{
    final static int GRASSEATER = 0;
    final static int MEATEATER = 1;

    int hunger = 0;
    int x,y;
    int type;
    int age = 0;

    public Animal(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }


}
