/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompareOperator;

/**
 *
 * @author User
 */
public interface CompareOperator {

    <T extends Comparable> boolean compare(T a, T b);

}
