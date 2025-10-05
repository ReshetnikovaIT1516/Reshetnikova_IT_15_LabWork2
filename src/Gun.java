public class Gun {
    private int bulletCount;

    // Конструктор без параметров (по умолчанию 5 патронов)
    public Gun() {
        this.bulletCount = 5;
    }

    // Конструктор с указанием начального количества патронов
    public Gun(int initialBullets) {
        String error = Validation.getBulletCountErrorMessage(initialBullets);
        if (error != null) {
            System.out.println("Ошибка создания пистолета: " + error);
            this.bulletCount = 5;
        } else {
            this.bulletCount = initialBullets;
        }
    }

    public void shoot() {
        if (bulletCount > 0) {
            System.out.println("Бах!");
            bulletCount--;
        } else {
            System.out.println("Клац!");
        }
    }

    public int getBulletCount() {
        return bulletCount;
    }
    public void setBulletCount(int bulletCount) {
        String error = Validation.getBulletCountErrorMessage(bulletCount);
        if (error != null) {
            System.out.println("Ошибка установки патронов: " + error);
            this.bulletCount = 5;
        } else {
            this.bulletCount = bulletCount;
        }
    }

    @Override
    public String toString() {
        return "Пистолет (патронов: " + bulletCount + ")";
    }
}