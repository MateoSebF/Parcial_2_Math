package com.parcial.arep_2.model;

import java.util.ArrayList;
import java.util.List;

public class MathOperation {

    private String operation;
    private String inputList;
    private int value;
    private int output;

    public MathOperation(){

    }

    public MathOperation(String operation, String inputList, int value, int output){
        this.operation = operation;
        this.inputList = inputList;
        this.value = value;
        this.output = makeOperation();
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setInputlist(String inputList){
        this.inputList = inputList;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setOutput(int output){
        this.output = output;
    }

    public String getOperation(){
        return operation;
    }

    public String getInputlist(){
        return inputList;
    }

    public int getValue(){
        return value;
    }

    public int getOutput(){
        return output;
    }

    public int makeOperation(){
        List<Integer> numbers = convertFromString(inputList);
        if (operation.equals("linearSearch")){
            return makeLinearSearch(numbers); 
        } else if (operation.equals("binarySearch")){
            return makeBinarySearch(numbers);
        }
        return -1;
    }

    private int makeLinearSearch(List<Integer> numbers){
        int result = -1;
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == value) {
                result = i;
                break;
            }
        }
        return result;
    }

    private int makeBinarySearch(List<Integer> numbers){
        numbers.sort(null);
        int result = binarySearch(numbers, 0, numbers.size()-1);
        return result;
    }

    private int binarySearch(List<Integer> numbers, int l, int r){
        if(l>r ) return -1;
        int mid = (l+r) / 2;
        if (numbers.get(mid) == value) return mid;
        // Si el numero de la mitad es mayor tomar la mitad izquierda
        else if (numbers.get(mid) > value){
            return binarySearch(numbers, l, mid - 1);
        }
        // Si el numero de la mitad es menor tomar la mitad derecha
        else {
            return binarySearch(numbers, mid+1, r);
        }
    }

    private List<Integer> convertFromString(String inputList){
        List<Integer> numbers = new ArrayList<>();
        String[] numStrings = inputList.split(",");
        for (String num : numStrings){
            numbers.add(Integer.parseInt(num));
        }
        return numbers;
    }
}
