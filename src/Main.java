public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(500, 40);
        boss.setHealth(500);
        boss.setDamage(40);
        boss.weapon.setChemical(WeaponType.CHEMICAL);
        boss.weapon.setFirearms(WeaponType.valueOf("AWP"));
        System.out.println(boss.info());
    }
}