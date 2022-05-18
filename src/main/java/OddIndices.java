public class OddIndices {
    /**
     * Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public int[] oddIndices(int[] array) {
        if (array.length > 0) {
            int[] newArray = new int[array.length / 2]; // высчитаваем количество нечетных индексов в массиве и присваиваем длинну другому массиву
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    newArray[j] = array[i]; //индексам нового массива присваиваем значение индекса старого массива
                    j++;                    //увеличиваем индекс нового массива
                }
            }

            return newArray;
        }

        return array;
    }
}


