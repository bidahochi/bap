//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EF-1 truck and pilot
// Model Creator: 
// Created on: 25.10.2020 - 23:20:41
// Last changed on: 25.10.2020 - 23:20:41

package ebf.bap.models.trucks; //Path where the model is located


import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelEF1_driver_front extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelEF1_driver_front() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[117];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 333
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 334
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 335
		bodyModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 336
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 339
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 341
		bodyModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 342
		bodyModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 343
		bodyModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 344
		bodyModel[9] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 345
		bodyModel[10] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 346
		bodyModel[11] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 347
		bodyModel[12] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 348
		bodyModel[13] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 349
		bodyModel[14] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 350
		bodyModel[15] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 351
		bodyModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 352
		bodyModel[17] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 353
		bodyModel[18] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 354
		bodyModel[19] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 355
		bodyModel[20] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 356
		bodyModel[21] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 357
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 358
		bodyModel[23] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 359
		bodyModel[24] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 360
		bodyModel[25] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 361
		bodyModel[26] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 362
		bodyModel[27] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 363
		bodyModel[28] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 364
		bodyModel[29] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 365
		bodyModel[30] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 369
		bodyModel[31] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 370
		bodyModel[32] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 371
		bodyModel[33] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 372
		bodyModel[34] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 373
		bodyModel[35] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 374
		bodyModel[36] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 375
		bodyModel[37] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 376
		bodyModel[38] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 377
		bodyModel[39] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 378
		bodyModel[40] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 379
		bodyModel[41] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 380
		bodyModel[42] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 381
		bodyModel[43] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 382
		bodyModel[44] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 383
		bodyModel[45] = new ModelRendererTurbo(this, 161, 25, textureX, textureY, StaticModelAnimator.tagWheel); // Box 384 wheel
		bodyModel[46] = new ModelRendererTurbo(this, 201, 25, textureX, textureY, StaticModelAnimator.tagWheel); // Box 385 wheel
		bodyModel[47] = new ModelRendererTurbo(this, 225, 25, textureX, textureY, StaticModelAnimator.tagWheel); // Box 386 wheel
		bodyModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, StaticModelAnimator.tagWheel); // Box 387 wheel
		bodyModel[49] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 388
		bodyModel[50] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 389
		bodyModel[51] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 390
		bodyModel[52] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 391
		bodyModel[53] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 392
		bodyModel[54] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 394
		bodyModel[55] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 395
		bodyModel[56] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 396
		bodyModel[57] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 397
		bodyModel[58] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 398
		bodyModel[59] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 399
		bodyModel[60] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 400
		bodyModel[61] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 401
		bodyModel[62] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 402
		bodyModel[63] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 403
		bodyModel[64] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 404
		bodyModel[65] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 405
		bodyModel[66] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 406
		bodyModel[67] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 407
		bodyModel[68] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 408
		bodyModel[69] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 409
		bodyModel[70] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 410
		bodyModel[71] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 411
		bodyModel[72] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 412
		bodyModel[73] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 413
		bodyModel[74] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 414
		bodyModel[75] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 415
		bodyModel[76] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 416
		bodyModel[77] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 417
		bodyModel[78] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 418
		bodyModel[79] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 419
		bodyModel[80] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 420
		bodyModel[81] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 421
		bodyModel[82] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 422
		bodyModel[83] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 423
		bodyModel[84] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 424
		bodyModel[85] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 425
		bodyModel[86] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 426
		bodyModel[87] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 427
		bodyModel[88] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 428
		bodyModel[89] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 430
		bodyModel[90] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 431
		bodyModel[91] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 432
		bodyModel[92] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 433
		bodyModel[93] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 434
		bodyModel[94] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 435
		bodyModel[95] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 436
		bodyModel[96] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 437
		bodyModel[97] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 438
		bodyModel[98] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 439
		bodyModel[99] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 440
		bodyModel[100] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 455
		bodyModel[101] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 456
		bodyModel[102] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 1
		bodyModel[103] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 4
		bodyModel[104] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 4
		bodyModel[105] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 4
		bodyModel[106] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 4
		bodyModel[107] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 4
		bodyModel[108] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 4
		bodyModel[109] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 1
		bodyModel[110] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 1
		bodyModel[111] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 427
		bodyModel[112] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 427
		bodyModel[113] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 427
		bodyModel[114] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 427
		bodyModel[115] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 427
		bodyModel[116] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 44, 1, 1, 0F); // Box 333
		bodyModel[0].setRotationPoint(-16F, 3F, 8F);

		bodyModel[1].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 334
		bodyModel[1].setRotationPoint(-2F, 7F, 8F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 335
		bodyModel[2].setRotationPoint(27F, 4F, 8F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[3].setRotationPoint(25F, 6F, 8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 339
		bodyModel[4].setRotationPoint(23F, 6F, 8F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 341
		bodyModel[5].setRotationPoint(18F, 4F, 8F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 342
		bodyModel[6].setRotationPoint(4F, 4F, 8F);

		bodyModel[7].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 343
		bodyModel[7].setRotationPoint(3F, 8F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 344
		bodyModel[8].setRotationPoint(17F, 8F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[9].setRotationPoint(8.5F, 5F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 346
		bodyModel[10].setRotationPoint(8.5F, 4.5F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[11].setRotationPoint(12.5F, 4.5F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[12].setRotationPoint(15.5F, 5F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[13].setRotationPoint(19.5F, 1F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 350
		bodyModel[14].setRotationPoint(15.5F, 1F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[15].setRotationPoint(15.5F, 0F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[16].setRotationPoint(5.5F, 1F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 353
		bodyModel[17].setRotationPoint(1.5F, 1F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[18].setRotationPoint(1.5F, 0F, 8F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[19].setRotationPoint(22.5F, 4F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[20].setRotationPoint(1.5F, 4F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 357
		bodyModel[21].setRotationPoint(17F, 8F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 358
		bodyModel[22].setRotationPoint(3F, 8F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // Box 359
		bodyModel[23].setRotationPoint(-2F, 7F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 360
		bodyModel[24].setRotationPoint(4F, 4F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 361
		bodyModel[25].setRotationPoint(18F, 4F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 362
		bodyModel[26].setRotationPoint(23F, 6F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 363
		bodyModel[27].setRotationPoint(25F, 6F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 364
		bodyModel[28].setRotationPoint(27F, 4F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 44, 1, 1, 0F); // Box 365
		bodyModel[29].setRotationPoint(-16F, 3F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 369
		bodyModel[30].setRotationPoint(1.5F, 1F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[31].setRotationPoint(5.5F, 1F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[32].setRotationPoint(1.5F, 0F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 372
		bodyModel[33].setRotationPoint(15.5F, 1F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[34].setRotationPoint(19.5F, 1F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[35].setRotationPoint(15.5F, 0F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 375
		bodyModel[36].setRotationPoint(19F, 1.5F, -9.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[37].setRotationPoint(15.5F, 5F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[38].setRotationPoint(12.5F, 4.5F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 378
		bodyModel[39].setRotationPoint(8.5F, 4.5F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[40].setRotationPoint(8.5F, 5F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 380
		bodyModel[41].setRotationPoint(22.5F, 4F, -9F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 381
		bodyModel[42].setRotationPoint(1.5F, 4F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 382
		bodyModel[43].setRotationPoint(4.5F, 4.5F, -8.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 383
		bodyModel[44].setRotationPoint(18.5F, 4.5F, -8.5F);

		bodyModel[45].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 384 wheel
		bodyModel[45].setRotationPoint(5.5F, 5.5F, -6F);

		bodyModel[46].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 385 wheel
		bodyModel[46].setRotationPoint(19.5F, 5.5F, -6F);

		bodyModel[47].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 386 wheel
		bodyModel[47].setRotationPoint(5.5F, 5.5F, 6F);

		bodyModel[48].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 387 wheel
		bodyModel[48].setRotationPoint(19.5F, 5.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[49].setRotationPoint(4.5F, 5F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[50].setRotationPoint(18.5F, 5F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[51].setRotationPoint(18.5F, 5F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[52].setRotationPoint(4.5F, 5F, 9F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 392
		bodyModel[53].setRotationPoint(25.75F, 4F, -8.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 394
		bodyModel[54].setRotationPoint(5F, 1.5F, -9.25F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 395
		bodyModel[55].setRotationPoint(19F, 1.5F, 8.25F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 396
		bodyModel[56].setRotationPoint(5F, 1.5F, 8.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 397
		bodyModel[57].setRotationPoint(15.5F, 0.5F, 8.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 398
		bodyModel[58].setRotationPoint(22.5F, 0.5F, 8.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 399
		bodyModel[59].setRotationPoint(8.5F, 0.5F, 8.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 400
		bodyModel[60].setRotationPoint(1.5F, 0.5F, 8.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 401
		bodyModel[61].setRotationPoint(11.5F, 2F, 7.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[62].setRotationPoint(11.5F, 1F, 7.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[63].setRotationPoint(10.5F, 1.5F, 7.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 404
		bodyModel[64].setRotationPoint(11.5F, 3.5F, 8.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 405
		bodyModel[65].setRotationPoint(10.75F, 3.5F, 7.75F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 406
		bodyModel[66].setRotationPoint(13.25F, 3.5F, 7.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 407
		bodyModel[67].setRotationPoint(15.5F, 0.5F, 7.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 408
		bodyModel[68].setRotationPoint(22.5F, 0.5F, 7.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 409
		bodyModel[69].setRotationPoint(8.5F, 0.5F, 7.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 410
		bodyModel[70].setRotationPoint(1.5F, 0.5F, 7.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 411
		bodyModel[71].setRotationPoint(15.5F, 0.5F, -8.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 412
		bodyModel[72].setRotationPoint(15.5F, 0.5F, -9.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 413
		bodyModel[73].setRotationPoint(22.5F, 0.5F, -9.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 414
		bodyModel[74].setRotationPoint(22.5F, 0.5F, -8.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 415
		bodyModel[75].setRotationPoint(8.5F, 0.5F, -9.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 416
		bodyModel[76].setRotationPoint(8.5F, 0.5F, -8.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 417
		bodyModel[77].setRotationPoint(1.5F, 0.5F, -9.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 418
		bodyModel[78].setRotationPoint(1.5F, 0.5F, -8.25F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 419
		bodyModel[79].setRotationPoint(13.25F, 3.5F, -8.75F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 420
		bodyModel[80].setRotationPoint(10.75F, 3.5F, -8.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 421
		bodyModel[81].setRotationPoint(11.5F, 3.5F, -9.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 422
		bodyModel[82].setRotationPoint(11.5F, 2F, -9.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[83].setRotationPoint(11.5F, 1F, -9.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[84].setRotationPoint(10.5F, 1.5F, -8.75F);

		bodyModel[85].addBox(0F, 0F, 0F, 7, 6, 10, 0F); // Box 425
		bodyModel[85].setRotationPoint(2F, 2F, -5F);

		bodyModel[86].addBox(0F, 0F, 0F, 7, 6, 10, 0F); // Box 426
		bodyModel[86].setRotationPoint(16F, 2F, -5F);

		bodyModel[87].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Box 427
		bodyModel[87].setRotationPoint(9F, 1F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[88].setRotationPoint(-16F, 4F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[89].setRotationPoint(-16F, 4F, 8F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 431
		bodyModel[90].setRotationPoint(0F, 4F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 432
		bodyModel[91].setRotationPoint(-3F, 4F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.05F, 0F); // Box 433
		bodyModel[92].setRotationPoint(-7F, 4F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.15F, 0F); // Box 434
		bodyModel[93].setRotationPoint(-12F, 4F, 8F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 435
		bodyModel[94].setRotationPoint(-19F, 3F, 8F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 436
		bodyModel[95].setRotationPoint(-19F, 3F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.15F, 0F); // Box 437
		bodyModel[96].setRotationPoint(-12F, 4F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 438
		bodyModel[97].setRotationPoint(-3F, 4F, -9F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 439
		bodyModel[98].setRotationPoint(0F, 4F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.05F, 0F); // Box 440
		bodyModel[99].setRotationPoint(-7F, 4F, -9F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 455
		bodyModel[100].setRotationPoint(-2F, 4F, 8F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 456
		bodyModel[101].setRotationPoint(-2F, 4F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 1
		bodyModel[102].setRotationPoint(-26F, 2F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[103].setRotationPoint(-23F, 4F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0.6F, 0F, 0F, -3.1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.225F, 0F, 0F, -2.725F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[104].setRotationPoint(-23F, 3F, 1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, -1F, -2F, 0F, -1F); // Box 4
		bodyModel[105].setRotationPoint(-23F, 6F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[106].setRotationPoint(-23F, 4F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -3.1F, 0F, 0F, 0.6F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -2.225F, 0F, 0F, -0.275F, 0F, 0F); // Box 4
		bodyModel[107].setRotationPoint(-23.5F, 3F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -0.5F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[108].setRotationPoint(-23F, 6F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 4, 22, 0F); // Box 1
		bodyModel[109].setRotationPoint(-20F, 1F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 1
		bodyModel[110].setRotationPoint(-22F, 1F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 427
		bodyModel[111].setRotationPoint(10.5F, 0.5F, -2F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 427
		bodyModel[112].setRotationPoint(-13F, 3.5F, -1.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 427
		bodyModel[113].setRotationPoint(-13.5F, 3F, -8F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Box 427
		bodyModel[114].setRotationPoint(-3.5F, 2.5F, -8.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 427
		bodyModel[115].setRotationPoint(-3.5F, 1.5F, -7F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 6, 8, 0F); // Box 1
		bodyModel[116].setRotationPoint(-22F, 3F, -4F);
	}
}