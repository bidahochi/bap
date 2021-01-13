//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Created on:12.02.2017 - 23:47:19
// Last changed on: 12.02.2017 - 23:47:19
/**
 * @author Eternal Blue Flame
 */
package ebf.bap.models.trucks;

import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class VATLogCarBogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public VATLogCarBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[36];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[11] = new ModelRendererTurbo(this, 265, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[15] = new ModelRendererTurbo(this, 369, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[16] = new ModelRendererTurbo(this, 393, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[19] = new ModelRendererTurbo(this, 465, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[21] = new ModelRendererTurbo(this, 289, 9, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[23] = new ModelRendererTurbo(this, 25, 17, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[24] = new ModelRendererTurbo(this, 49, 17, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
		bodyModel[25] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box10
		bodyModel[26] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box10
		bodyModel[27] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box10
		bodyModel[28] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 53
		bodyModel[29] = new ModelRendererTurbo(this, 57, 17, textureX, textureY, StaticModelAnimator.tagSimpleRotate); // axle
		bodyModel[30] = new ModelRendererTurbo(this, 89, 17, textureX, textureY, StaticModelAnimator.tagSimpleRotate); // axle
		bodyModel[31] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 42
		bodyModel[33] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 40

		bodyModel[0].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[0].setRotationPoint(5.5F, 6F, -6F);

		bodyModel[1].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[1].setRotationPoint(5.5F, 6F, -5.5F);

		bodyModel[2].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[2].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[3].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[3].setRotationPoint(5.5F, 6F, 6F);

		bodyModel[4].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[4].setRotationPoint(5.5F, 6F, -5.9F);

		bodyModel[5].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[5].setRotationPoint(5.5F, 6F, -5.8F);

		bodyModel[6].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[6].setRotationPoint(5.5F, 6F, -5.7F);

		bodyModel[7].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[7].setRotationPoint(5.5F, 6F, -5.6F);

		bodyModel[8].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[8].setRotationPoint(5.5F, 6F, 5.6F);

		bodyModel[9].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[9].setRotationPoint(5.5F, 6F, 5.7F);

		bodyModel[10].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[10].setRotationPoint(5.5F, 6F, 5.8F);

		bodyModel[11].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[11].setRotationPoint(5.5F, 6F, 5.9F);

		bodyModel[12].addShapeBox(-5F, -5F, 0F, 15, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[12].setRotationPoint(-2.5F, 7.5F, 6.4F);

		bodyModel[13].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[13].setRotationPoint(-5.5F, 6F, -6F);

		bodyModel[14].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[14].setRotationPoint(-5.5F, 6F, -5.5F);

		bodyModel[15].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[15].setRotationPoint(-5.5F, 6F, 5.5F);

		bodyModel[16].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[16].setRotationPoint(-5.5F, 6F, 6F);

		bodyModel[17].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[17].setRotationPoint(-5.5F, 6F, -5.9F);

		bodyModel[18].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[18].setRotationPoint(-5.5F, 6F, -5.8F);

		bodyModel[19].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[19].setRotationPoint(-5.5F, 6F, -5.7F);

		bodyModel[20].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[20].setRotationPoint(-5.5F, 6F, -5.6F);

		bodyModel[21].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[21].setRotationPoint(-5.5F, 6F, 5.6F);

		bodyModel[22].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[22].setRotationPoint(-5.5F, 6F, 5.7F);

		bodyModel[23].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[23].setRotationPoint(-5.5F, 6F, 5.8F);

		bodyModel[24].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // wheel
		bodyModel[24].setRotationPoint(-5.5F, 6F, 5.9F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Box10
		bodyModel[25].setRotationPoint(-1.5F, 2.5F, -6F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box10
		bodyModel[26].setRotationPoint(-1F, 0.5F, -1F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box10
		bodyModel[27].setRotationPoint(-0.5F, 0.5F, 3.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 53
		bodyModel[28].setRotationPoint(-0.5F, 0.5F, -4.5F);

		bodyModel[29].addShapeBox(-2F, -2F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // axle
		bodyModel[29].setRotationPoint(6.5F, 7F, -6F);

		bodyModel[30].addShapeBox(-2F, -2F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // axle
		bodyModel[30].setRotationPoint(-4.5F, 7F, -6F);

		bodyModel[31].addShapeBox(-5F, -5F, 0F, 15, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[31].setRotationPoint(-2.5F, 7.5F, 6.3F);

		bodyModel[32].addShapeBox(-5F, -5F, 0F, 15, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[32].setRotationPoint(-2.5F, 7.5F, 6.2F);

		bodyModel[33].addShapeBox(-5F, -5F, 0F, 15, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(-2.5F, 7.5F, -6.4F);

		bodyModel[34].addShapeBox(-5F, -5F, 0F, 15, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-2.5F, 7.5F, -6.3F);

		bodyModel[35].addShapeBox(-5F, -5F, 0F, 15, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-2.5F, 7.5F, -6.2F);
	}
}