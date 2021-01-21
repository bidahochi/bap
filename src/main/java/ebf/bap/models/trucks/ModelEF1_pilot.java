//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.01.2021 - 20:32:21
// Last changed on: 20.01.2021 - 20:32:21

package ebf.bap.models.trucks; //Path where the model is located


import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelEF1_pilot extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelEF1_pilot() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[18];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 329 wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 330 wheel
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 331 wheel
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, StaticModelAnimator.tagWheel); // Box 332 wheel
		bodyModel[4] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 441
		bodyModel[5] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 442
		bodyModel[6] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 443
		bodyModel[7] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 445
		bodyModel[8] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 446
		bodyModel[9] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 447
		bodyModel[10] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 448
		bodyModel[11] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 450
		bodyModel[12] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 451
		bodyModel[13] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 452
		bodyModel[14] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 453
		bodyModel[15] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 454
		bodyModel[16] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 427
		bodyModel[17] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 449

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 329 wheel
		bodyModel[0].setRotationPoint(4.5F, 7F, 6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 330 wheel
		bodyModel[1].setRotationPoint(-4.5F, 7F, 6F);

		bodyModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 331 wheel
		bodyModel[2].setRotationPoint(4.5F, 7F, -6F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 332 wheel
		bodyModel[3].setRotationPoint(-4.5F, 7F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 441
		bodyModel[4].setRotationPoint(-5.5F, 6F, -6.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 442
		bodyModel[5].setRotationPoint(3.5F, 6F, -6.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 13, 4, 10, 0F); // Box 443
		bodyModel[6].setRotationPoint(-6.5F, 5F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 445
		bodyModel[7].setRotationPoint(-1.5F, 6F, 4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 446
		bodyModel[8].setRotationPoint(-0.5F, 6F, 4.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 447
		bodyModel[9].setRotationPoint(0.5F, 6F, 4.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 448
		bodyModel[10].setRotationPoint(-2.5F, 8F, 4.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 450
		bodyModel[11].setRotationPoint(-2.5F, 5F, -5.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 451
		bodyModel[12].setRotationPoint(-2.5F, 8F, -5.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 452
		bodyModel[13].setRotationPoint(-1.5F, 6F, -5.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 453
		bodyModel[14].setRotationPoint(-0.5F, 6F, -5.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 454
		bodyModel[15].setRotationPoint(0.5F, 6F, -5.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 427
		bodyModel[16].setRotationPoint(-2F, 4.5F, -2F);

		bodyModel[17].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 449
		bodyModel[17].setRotationPoint(-2.5F, 5F, 4.5F);
	}
}