package com.designpatterndemo.chenxkang.principles.LSP;

/**
 * author: xiaokang
 * time  : 17/3/30
 * desc  : 士兵实现类
 */

public class Soldier {

    private BaseGun gun;

    public void setGun(BaseGun gun) {
        this.gun = gun;
    }

    public void startShoot(){
        this.gun.gunZoom();
        this.gun.characteristic();
        this.gun.shoot();
    }
}
