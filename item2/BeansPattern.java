package item2;

public class BeansPattern {

    static class NutritionFacts {
        // 매개변수들은 (기본값이 있다면) 기본값으로 초기화 한다.
        private int servingSize = -1; // 필수; 기본값 없음
        private int servings = -1;   // 필수; 기본값 없음
        private int calories = 0;  
        private int fat = 0;  
        private int sodium = 0;  
        private int carbohydrate = 0;

        public void setServingSize(int servingSize) {
            this.servingSize = servingSize;
        }
        public void setServings(int servings) {
            this.servings = servings;
        }
        public void setCalories(int calories) {
            this.calories = calories;
        }
        public void setFat(int fat) {
            this.fat = fat;
        }
        public void setSodium(int sodium) {
            this.sodium = sodium;
        }
        public void setCarbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
        }

        
    }

    public static void main(String[] args) {
        NutritionFacts cocacola = new NutritionFacts();
        cocacola.setServingSize(240);
        cocacola.setServings(8);
        cocacola.setCalories(100);
        cocacola.setSodium(35);
        cocacola.setCarbohydrate(27);
        cocacola.setFat(10);

        System.out.println(cocacola.servingSize);
    }


    
}
