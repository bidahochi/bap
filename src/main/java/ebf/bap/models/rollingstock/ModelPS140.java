//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PS140
// Model Creator: 
// Created on: 28.12.2020 - 00:41:12
// Last changed on: 28.12.2020 - 00:41:12

package ebf.bap.models.rollingstock; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelPS140 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPS140() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box3
		bodyModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box5
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box8
		bodyModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box9
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box39
		bodyModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box40
		bodyModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box42
		bodyModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box43
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box44
		bodyModel[11] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box45
		bodyModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box72
		bodyModel[13] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box78
		bodyModel[14] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box87
		bodyModel[15] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box104
		bodyModel[16] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import Box105
		bodyModel[17] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box106
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box108
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		bodyModel[20] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box0
		bodyModel[21] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		bodyModel[22] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		bodyModel[23] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import Box40
		bodyModel[24] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import Box106
		bodyModel[25] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box106
		bodyModel[26] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box106
		bodyModel[27] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box40
		bodyModel[28] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box40
		bodyModel[29] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import Box40
		bodyModel[30] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box40
		bodyModel[31] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box40cul
		bodyModel[32] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import Box40cul
		bodyModel[33] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box40cul
		bodyModel[34] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import Box40cul
		bodyModel[35] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import Box40
		bodyModel[36] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import Box40cul
		bodyModel[37] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Box40cul
		bodyModel[38] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import Box40cul
		bodyModel[39] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import Box39
		bodyModel[40] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box39
		bodyModel[41] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Import Box3
		bodyModel[42] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import Box3
		bodyModel[43] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box87
		bodyModel[44] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box40
		bodyModel[45] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box40
		bodyModel[46] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box40
		bodyModel[47] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import Box40
		bodyModel[48] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box40
		bodyModel[49] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box40

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-19F, 5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Import Box1
		bodyModel[1].setRotationPoint(-27F, 2F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 22, 20, 1, 0F); // Import Box3
		bodyModel[2].setRotationPoint(-27F, -18F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 22, 20, 1, 0F); // Import Box5
		bodyModel[3].setRotationPoint(5F, -18F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Import Box8
		bodyModel[4].setRotationPoint(-27F, -18F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Import Box9
		bodyModel[5].setRotationPoint(26F, -18F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 58, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[6].setRotationPoint(-29F, -20F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 26, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[7].setRotationPoint(-15.5F, 3F, 11F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Import Box42
		bodyModel[8].setRotationPoint(-19F, 2.8F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Import Box43
		bodyModel[9].setRotationPoint(-19F, 2.8F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Import Box44
		bodyModel[10].setRotationPoint(17F, 2.8F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Import Box45
		bodyModel[11].setRotationPoint(17F, 2.8F, 2F);

		bodyModel[12].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Import Box72
		bodyModel[12].setRotationPoint(-27.51F, -19F, 2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		bodyModel[13].setRotationPoint(-5.5F, -17F, -11.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box87
		bodyModel[14].setRotationPoint(-27.5F, -18F, 3F);

		bodyModel[15].addBox(0F, 0F, 0F, 22, 20, 1, 0F); // Import Box104
		bodyModel[15].setRotationPoint(5F, -18F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 22, 20, 1, 0F); // Import Box105
		bodyModel[16].setRotationPoint(-27F, -18F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[17].setRotationPoint(-15.5F, -18F, 10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		bodyModel[18].setRotationPoint(-5.5F, -17F, 10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Import Box0
		bodyModel[19].setRotationPoint(28F, 3F, -1.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 56, 2, 5, 0F); // Import Box0
		bodyModel[20].setRotationPoint(-28F, 3F, -2.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Import Box0
		bodyModel[21].setRotationPoint(-31F, 3F, -1.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import Box0
		bodyModel[22].setRotationPoint(17F, 5F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 26, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box40
		bodyModel[23].setRotationPoint(-10.5F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box106
		bodyModel[24].setRotationPoint(-15.5F, 3F, 10.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		bodyModel[25].setRotationPoint(-5.5F, -18F, -11.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box106
		bodyModel[26].setRotationPoint(-5.5F, 3F, -11.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[27].setRotationPoint(-27F, 3F, 11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[28].setRotationPoint(-27F, 3F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[29].setRotationPoint(23F, 3F, 11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[30].setRotationPoint(23F, 3F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40cul
		bodyModel[31].setRotationPoint(26.5F, -7F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40cul
		bodyModel[32].setRotationPoint(22.99F, -7F, 10.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40cul
		bodyModel[33].setRotationPoint(26.5F, -17F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40cul
		bodyModel[34].setRotationPoint(-27.5F, -17F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[35].setRotationPoint(-27.5F, -7F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40cul
		bodyModel[36].setRotationPoint(-26.99F, -17F, 10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40cul
		bodyModel[37].setRotationPoint(22.99F, -17F, -11.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40cul
		bodyModel[38].setRotationPoint(-26.99F, -7F, -11.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 54, 2, 10, 0F,0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[39].setRotationPoint(-27F, -20F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 54, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box39
		bodyModel[40].setRotationPoint(-27F, -20F, 0F);

		bodyModel[41].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import Box3
		bodyModel[41].setRotationPoint(-5F, -18F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import Box3
		bodyModel[42].setRotationPoint(-5F, -18F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Import Box87
		bodyModel[43].setRotationPoint(-28.5F, -14F, 2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box40
		bodyModel[44].setRotationPoint(-20F, 3F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box40
		bodyModel[45].setRotationPoint(16F, 3F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box40
		bodyModel[46].setRotationPoint(-20F, 3F, 11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box40
		bodyModel[47].setRotationPoint(16F, 3F, 11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box40
		bodyModel[48].setRotationPoint(-15F, 3F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box40
		bodyModel[49].setRotationPoint(12F, 3F, 11F);
	}
}