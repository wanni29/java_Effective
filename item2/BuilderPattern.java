package item2;

public  class BuilderPattern {

    static class NutritionFacts {
        // 매개변수들은 (기본값이 있다면) 기본값으로 초기화 한다.
        private int servingSize;
        private int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        public  static class Builder {
            // 필수 매겨변수
            private final int servingSize;
            private final int servings;

            // 선택 매개변수 - 기본값으로 초기화한다.
            private int calories = 0;
            private int fat = 0;
            private int sodium = 0;
            private int carbohydrate = 0;

            public Builder(int servingSize, int servings) {
                this.servingSize = servingSize;
                this.servings = servings;
            }

            public Builder calories(int calories) {
                this.calories = calories;
                return this;
            }

            public Builder fat(int fat) {
                this.fat = fat;
                return this;
            }

            public Builder sodium(int sodium) {
                this.sodium = sodium;
                return this;
            }

            public Builder carbohydrate(int carbohydrate) {
                this.carbohydrate = carbohydrate;
                return this;
            }

            public NutritionFacts build() {
                return new NutritionFacts(this);
            }
        }

        private NutritionFacts(Builder builder) {
            servingSize = builder.servingSize;
            servings = builder.servings;
            calories = builder.calories;
            fat = builder.fat;
            sodium = builder.sodium;
            carbohydrate = builder.carbohydrate;
        }

    }

    public static void main(String[] args) {
        NutritionFacts cocacola = new NutritionFacts.Builder(240,8)
        .calories(100).sodium(35).carbohydrate(27).build();


        System.out.println(cocacola.calories);
    }

}
