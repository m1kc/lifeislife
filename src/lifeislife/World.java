/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lifeislife;

import java.util.Date;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author m1kc
 */
public class World
{
    int[][] world;
    int w,h;
    Vector animals;

    static Random random = new Random(new Date().getTime());

    final static int LEFT = 0;
    final static int RIGHT = 1;
    final static int UP = 2;
    final static int DOWN = 3;

    final static int INVALID = -1;
    final static int NOTHING = 0;
    final static int ROCK = 1;
    final static int GRASS = 2;

    public World(int w,int h)
    {
        this.w = w;
        this.h = h;
        world = new int[w][h];

        for (int x=0; x<w; x++)
        {
            for (int y=0; y<h; y++)
            {
                world[x][y] = NOTHING;
            }
        }

        animals = new Vector();
    }

    public void step(boolean verbose)
    {
        if (verbose) System.out.println("Turn start.");

        if (verbose) System.out.println("Processing: random grass...");
        if (random.nextInt()%2==0)
        {
            int x,y;
            int tries = 0;
            do
            {
                x = Math.abs(random.nextInt()%w);
                y = Math.abs(random.nextInt()%h);
                tries++; if (tries==10000) break;
            }
            while (world[x][y] != NOTHING);
            if (tries<10000) world[x][y] = GRASS;
            if (verbose) System.out.println("Added grass at: "+x+","+y);
        }

        if (verbose) System.out.println("Processing: movements...");
        for (int i=0; i<animals.size(); i++)
        {
            Animal a = (Animal) animals.elementAt(i);
            int d = randomDirection();
            int nx = newX(a.x,d);
            int ny = newY(a.y,d);
            if ((getTile(nx,ny)==NOTHING)||(getTile(nx,ny)==GRASS))
            {
                a.x = nx;
                a.y = ny;
                if (verbose) System.out.println("Moved to: "+nx+","+ny);
            }
        }

        if (verbose) System.out.println("Processing: eating...");
        for (int i=0; i<animals.size(); i++)
        {
            Animal a = (Animal) animals.elementAt(i);
            if (getTile(a.x,a.y)==GRASS && a.type == Animal.GRASSEATER && a.hunger<=0)
            {
                world[a.x][a.y] = NOTHING;
                a.hunger+=100;
                if (verbose) System.out.println("Eaten grass: "+a.x+","+a.y);
            }
            if (a.type==Animal.MEATEATER && a.hunger<=0)
            {
                Animal victim = null;
                for (int j=0; j<animals.size(); j++)
                {
                    Animal a2 = (Animal) animals.elementAt(j);
                    if (a2.x==a.x && a2.y == a.y && a2.type==Animal.GRASSEATER)
                    {
                        victim = a2;
                    }
                }
                if (victim != null)
                {
                    a.hunger+=68;
                    animals.removeElement(victim);
                    if (verbose) System.out.println("Eaten somebody: "+a.x+","+a.y);
                }
            }
        }

        if (verbose) System.out.println("Processing: hunger...");
        for (int i=0; i<animals.size(); i++)
        {
            Animal a = (Animal) animals.elementAt(i);
            a.hunger--;
            if (verbose) System.out.println("Hunger: " + a.hunger);
            if (a.hunger == -50)
            {
                animals.removeElement(a);
                if (verbose) System.out.println("Died: " + a.x + "," + a.y);
            }
        }

        if (verbose) System.out.println("Processing: age...");
        for (int i=0; i<animals.size(); i++)
        {
            Animal a = (Animal) animals.elementAt(i);
            a.age++;
            if (verbose) System.out.println("Age: " + a.age);
            if (a.age == 80)
            {
                animals.removeElement(a);
                if (verbose) System.out.println("Died: " + a.x + "," + a.y);
            }
        }
        
        if (verbose) System.out.println("Processing: population...");
        for (int i=0; i<animals.size(); i++)
        {
            if (random.nextInt()%20==0)
            {
                Animal a = (Animal) animals.elementAt(i);
                // Ежели жрать нечего, размножаться тоже незачем
                if ((a.hunger>0)&&(a.age>20)) animals.addElement(new Animal(a.x,a.y,a.type));
            }
        }

        if (verbose) System.out.println("Turn end.");
        if (verbose) System.out.println("");
    }

    private int getTile(int x,int y)
    {
        if (x<0) return INVALID;
        if (y<0) return INVALID;
        if (x>=w) return INVALID;
        if (y>=h) return INVALID;
        return world[x][y];
    }

    private static int randomDirection()
    {
        return Math.abs(random.nextInt()%5);
    }

    private static int newX(int x,int d)
    {
        if (d==LEFT) return x-1;
        if (d==RIGHT) return x+1;
        return x;
    }

    private static int newY(int y,int d)
    {
        if (d==UP) return y-1;
        if (d==DOWN) return y+1;
        return y;
    }
}
