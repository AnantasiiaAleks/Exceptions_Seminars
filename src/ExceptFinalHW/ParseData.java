package ExceptFinalHW;

import java.util.HashMap;

public class ParseData {

    public HashMap<String, Object> parseInputData() {
        InputData inputData = new InputData();
        String[] data = inputData.inputData();
        HashMap<String, Object> dataDict = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String element : data) {
            if (element.length() == 1) {
                if (element.equals("f") || element.equals("m")) {
                    dataDict.put("6", element);
                } else{
                    try {
                        throw new SexException();
                    } catch (SexException e) {
                        e.sexException(element);
                    }
                }
            } else if (element.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrayDate = element.split("\\.");
                boolean flag = false;
                if (Integer.parseInt(arrayDate[0]) < 0 ||
                        Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) < 0 ||
                        Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) < 1923 ||
                        Integer.parseInt(arrayDate[2]) > 2024 ) {
                    try {
                        throw new BirthException();
                    } catch (BirthException e) {
                        e.birthException(element);
                    }
                } else {
                    if (Integer.parseInt(arrayDate[2]) % 4 == 0 &&
                            Integer.parseInt(arrayDate[2]) % 100 != 0) {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) <= 31) {
                                flag = true;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) <= 29) {
                                flag = true;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) <= 30) {
                                flag = true;
                            }
                        }
                    } else {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) <= 31) {
                                flag = true;
                            }
                        } else if (Integer.parseInt(arrayDate[2]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) <= 28) {
                                flag = true;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) <= 30) {
                                flag = true;
                            }
                        }

                    }
                    if (flag) {
                        dataDict.put("4", element);
                    } else try {
                        throw new BirthException();
                    } catch (BirthException e) {
                        e.birthException(element);
                    }
                }

            } else if (element.matches("[0-9]+")) {
                dataDict.put("5", element);
            } else if (element.matches("[A-Za-z]+") || element.matches("[А-Яа-я]+")) {
                sb.append(element).append(" ");
            } else {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    e.dataException(element);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataDict.put("2", fullName[1]);
            dataDict.put("1", fullName[0]);
            dataDict.put("3", fullName[2]);
        }
        return dataDict;
    }

}