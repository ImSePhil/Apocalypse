package net.internalerror.apocalypse.client.entity.model;

import net.internalerror.apocalypse.entities.EvolvedZombieEntity;
import net.minecraft.client.renderer.entity.model.ZombieModel;

public class EvolvedZombieModel<T extends EvolvedZombieEntity> extends ZombieModel<T> {

    public EvolvedZombieModel(float modelSize, boolean p_i1168_2_) {
        super(modelSize, p_i1168_2_);
    }

    protected EvolvedZombieModel(float p_i48914_1_, float p_i48914_2_, int p_i48914_3_, int p_i48914_4_) {
        super(p_i48914_1_, p_i48914_2_, p_i48914_3_, p_i48914_4_);
    }

    public boolean isAggressive(T entityIn) {
        return entityIn.isAggressive();
    }
}