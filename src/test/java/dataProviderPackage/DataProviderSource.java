package dataProviderPackage;

import org.testng.annotations.DataProvider;

/**
 * Created by Zakir_Mustafin on 1/30/2017.
 */
public class DataProviderSource {

    @DataProvider(name = "dataForMult")
    public static Object[][] dataForMult(){
        return new Object[][]{
                {3, 2, 6},
                {0, 0, 0},
                {-1, 1, -1},
                {1, 0, 0}
        };
    }

    @DataProvider(name = "dataForCos")
    public static Object[][] dataForCos(){
        return new Object[][]{
                {0, 1.0},
                {30, Math.cos(Math.toRadians(30))},
                {45, Math.cos(Math.toRadians(45))},
                {60, Math.cos(Math.toRadians(60))},
                {90, 0.0},
                {120, Math.cos(Math.toRadians(120))},
                {180, -1.0},
                {270, 0.0},
                {360, 1.0}
        };
    }

    @DataProvider(name = "dataForCtg")
    public static Object[][] dataForCtg(){
        return new Object[][]{
                {30, 1.0/Math.tan(Math.toRadians(30))},
                {45, 1.0},
                {60, 1.0/Math.tan(Math.toRadians(60))},
                {90, 0.0},
                {120, 1.0/Math.tan(Math.toRadians(120))},
                {270, 0.0}
        };
    }

    @DataProvider(name = "dataForDivide")
    public static Object[][] dataForDivide(){
        return new Object[][]{
                {12, 2, 6},
                {-8, 1, -8},
                {-8, -2, 4},
                {-8, -2, 4},
                {6, -2, -3}
        };
    }

    @DataProvider(name = "dataForIsNegative")
    public static Object[][] dataForIsNegative(){
        return new Object[][]{
                {9, true},
                {-1, false},
                {0, true}
        };
    }

    @DataProvider(name = "dataForIsPositive")
    public static Object[][] dataForIsPositive(){
        return new Object[][]{
                {9, false},
                {-1, true},
                {0, true}
        };
    }

    @DataProvider(name = "dataForPow")
    public static Object[][] dataForPow(){
        return new Object[][]{
                {3, 2, 9},
                {3, 3, 27},
                {0, 0, 1},
                {4, 0, 1},
                {-1, 1, -1},
                {-4, 2, 16},
                {4, -2, Math.pow(4, -2)}
        };
    }

    @DataProvider(name = "dataForSin")
    public static Object[][] dataForSin(){
        return new Object[][]{
                {0, 0.0},
                {30, Math.sin(Math.toRadians(30))},
                {45, Math.sin(Math.toRadians(45))},
                {60, Math.sin(Math.toRadians(60))},
                {90, 1.0},
                {120, Math.sin(Math.toRadians(120))},
                {180, 0.0},
                {270, -1.0},
                {360, -0.0}
        };
    }

    @DataProvider(name = "dataForSqrt")
    public static Object[][] dataForSqrt(){
        return new Object[][]{
                {9, 3},
                {1, 1},
                {0, 0}
        };
    }

    @DataProvider(name = "dataForSub")
    public static Object[][] dataForSub(){
        return new Object[][]{
                {3, 2, 1},
                {0, 0, 0},
                {-1, 1, -2},
                {1, -10, 11}
        };
    }

    @DataProvider(name = "dataForSum")
    public static Object[][] dataForSum(){
        return new Object[][]{
                {1, 2, 3},
                {0, 0, 0},
                {-1, 1, 0},
                {1, -10, -9}
        };
    }

    @DataProvider(name = "dataForTg")
    public static Object[][] dataForTg(){
        return new Object[][]{
                {0, 0.0},
                {30, Math.tan(Math.toRadians(30))}, //1/Math.sqrt(3)},
                {45, 1.0}, //1},
                {60, Math.tan(Math.toRadians(60))}, //Math.sqrt(3)},
                {120, Math.tan(Math.toRadians(120))}, //-1*Math.sqrt(3)},
                {180, 0.0},
                {360, 0.0}
        };
    }
}
