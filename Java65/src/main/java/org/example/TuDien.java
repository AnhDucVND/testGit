package org.example;

import java.util.*;

public class TuDien {
    private final Map<String, String> tuDien = new TreeMap<String, String>();

    public static void main(String[] args) {
        TuDien tuDien1 = new TuDien();
        int luaChon = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("MEMU");
            System.out.println("Tra từ điển tiếng anh:\n"
                    + "1. Thêm từ\n"
                    + "2. Xoá từ\n"
                    + "3. Tìm ý nghĩa của từ khoá\n"
                    + "4. In ra danh sách từ\n"
                    + "5. In ra số lượng từ\n"
                    + "6. Xoá tất cả các từ khoá");

            luaChon = scanner.nextInt();
            scanner.nextLine();

            if (luaChon == 1) {
                System.out.println("Input Key: ");
                String key = scanner.nextLine();
                System.out.println("Input Value:");
                String value = scanner.nextLine();
                tuDien1.addWord(key, value);
            } else if (luaChon == 2 || luaChon == 3) {
                if (luaChon == 2) {
                    System.out.println("Input key want delete: ");
                    String key = scanner.nextLine();
                    tuDien1.deleteWord(key);
                } else {
                    System.out.println("Input key: ");
                    String key = scanner.nextLine();
                    System.out.println(key+" : "+tuDien1.valueOfKey(key));
                }
            } else if (luaChon == 4 || luaChon == 5) {
                if (luaChon == 4) {
                    tuDien1.printAllKey();
                } else {
                    System.out.println("Số lượng từ là: "+tuDien1.getSize());
                }
            } else {
                tuDien1.deleteAll();
            }
        } while (luaChon != 0);
    }

    public String addWord(String key, String value) {
        return this.tuDien.put(key, value);
    }

    public void deleteWord(String key) {
        this.tuDien.remove(key);
    }

    public String valueOfKey(String key) {
        String value = this.tuDien.get(key);
        return value;
    }

    public void printAllKey() {
        Set<String> tapHopTuKHoa = this.tuDien.keySet();
        //System.out.println(Arrays.toString(tapHopTuKHoa.toArray()));
        for (String tuKhoa : tapHopTuKHoa) {
            System.out.println(tuKhoa);
        }
    }

    public int getSize() {
        return this.tuDien.size();
    }

    public void deleteAll() {
        this.tuDien.clear();
    }


}
