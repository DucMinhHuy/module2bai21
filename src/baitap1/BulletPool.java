package baitap1;

public class BulletPool extends MemoryPool{

    @Override
    protected Object allocate() {
        return new Bullet();
    }
}
