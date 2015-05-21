/**
Defines zip and resultOf for all arities

Autogenerated using tools/codegen.sh
*/
package org.scalacheck
private[scalacheck] trait GenArities{
  // zip //
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1](
    g1:Gen[T1]
  ): Gen[(T1)] = {
    val g = for {
      t1<-g1
    } yield (t1)
    g.suchThat {
      case (t1) =>
        g1.sieveCopy(t1)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2](
    g1:Gen[T1], g2:Gen[T2]
  ): Gen[(T1,T2)] = {
    val g = for {
      t1<-g1; t2<-g2
    } yield (t1, t2)
    g.suchThat {
      case (t1, t2) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3]
  ): Gen[(T1,T2,T3)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3
    } yield (t1, t2, t3)
    g.suchThat {
      case (t1, t2, t3) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4]
  ): Gen[(T1,T2,T3,T4)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4
    } yield (t1, t2, t3, t4)
    g.suchThat {
      case (t1, t2, t3, t4) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5]
  ): Gen[(T1,T2,T3,T4,T5)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5
    } yield (t1, t2, t3, t4, t5)
    g.suchThat {
      case (t1, t2, t3, t4, t5) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6]
  ): Gen[(T1,T2,T3,T4,T5,T6)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6
    } yield (t1, t2, t3, t4, t5, t6)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7
    } yield (t1, t2, t3, t4, t5, t6, t7)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8
    } yield (t1, t2, t3, t4, t5, t6, t7, t8)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14], g15:Gen[T15]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14; t15<-g15
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14) && g15.sieveCopy(t15)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14], g15:Gen[T15], g16:Gen[T16]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14; t15<-g15; t16<-g16
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14) && g15.sieveCopy(t15) && g16.sieveCopy(t16)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14], g15:Gen[T15], g16:Gen[T16], g17:Gen[T17]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14; t15<-g15; t16<-g16; t17<-g17
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14) && g15.sieveCopy(t15) && g16.sieveCopy(t16) && g17.sieveCopy(t17)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14], g15:Gen[T15], g16:Gen[T16], g17:Gen[T17], g18:Gen[T18]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14; t15<-g15; t16<-g16; t17<-g17; t18<-g18
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14) && g15.sieveCopy(t15) && g16.sieveCopy(t16) && g17.sieveCopy(t17) && g18.sieveCopy(t18)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14], g15:Gen[T15], g16:Gen[T16], g17:Gen[T17], g18:Gen[T18], g19:Gen[T19]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14; t15<-g15; t16<-g16; t17<-g17; t18<-g18; t19<-g19
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14) && g15.sieveCopy(t15) && g16.sieveCopy(t16) && g17.sieveCopy(t17) && g18.sieveCopy(t18) && g19.sieveCopy(t19)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14], g15:Gen[T15], g16:Gen[T16], g17:Gen[T17], g18:Gen[T18], g19:Gen[T19], g20:Gen[T20]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14; t15<-g15; t16<-g16; t17<-g17; t18<-g18; t19<-g19; t20<-g20
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14) && g15.sieveCopy(t15) && g16.sieveCopy(t16) && g17.sieveCopy(t17) && g18.sieveCopy(t18) && g19.sieveCopy(t19) && g20.sieveCopy(t20)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14], g15:Gen[T15], g16:Gen[T16], g17:Gen[T17], g18:Gen[T18], g19:Gen[T19], g20:Gen[T20], g21:Gen[T21]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14; t15<-g15; t16<-g16; t17<-g17; t18<-g18; t19<-g19; t20<-g20; t21<-g21
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14) && g15.sieveCopy(t15) && g16.sieveCopy(t16) && g17.sieveCopy(t17) && g18.sieveCopy(t18) && g19.sieveCopy(t19) && g20.sieveCopy(t20) && g21.sieveCopy(t21)
    }
  }
  
  /** Combines the given generators into one generator that produces a
   *  tuple of their generated values. */
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
    g1:Gen[T1], g2:Gen[T2], g3:Gen[T3], g4:Gen[T4], g5:Gen[T5], g6:Gen[T6], g7:Gen[T7], g8:Gen[T8], g9:Gen[T9], g10:Gen[T10], g11:Gen[T11], g12:Gen[T12], g13:Gen[T13], g14:Gen[T14], g15:Gen[T15], g16:Gen[T16], g17:Gen[T17], g18:Gen[T18], g19:Gen[T19], g20:Gen[T20], g21:Gen[T21], g22:Gen[T22]
  ): Gen[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22)] = {
    val g = for {
      t1<-g1; t2<-g2; t3<-g3; t4<-g4; t5<-g5; t6<-g6; t7<-g7; t8<-g8; t9<-g9; t10<-g10; t11<-g11; t12<-g12; t13<-g13; t14<-g14; t15<-g15; t16<-g16; t17<-g17; t18<-g18; t19<-g19; t20<-g20; t21<-g21; t22<-g22
    } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22)
    g.suchThat {
      case (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22) =>
        g1.sieveCopy(t1) && g2.sieveCopy(t2) && g3.sieveCopy(t3) && g4.sieveCopy(t4) && g5.sieveCopy(t5) && g6.sieveCopy(t6) && g7.sieveCopy(t7) && g8.sieveCopy(t8) && g9.sieveCopy(t9) && g10.sieveCopy(t10) && g11.sieveCopy(t11) && g12.sieveCopy(t12) && g13.sieveCopy(t13) && g14.sieveCopy(t14) && g15.sieveCopy(t15) && g16.sieveCopy(t16) && g17.sieveCopy(t17) && g18.sieveCopy(t18) && g19.sieveCopy(t19) && g20.sieveCopy(t20) && g21.sieveCopy(t21) && g22.sieveCopy(t22)
    }
  }
  

  // resultOf //
  import Arbitrary.arbitrary
  def resultOf[T,R](f: T => R)(implicit a: Arbitrary[T]): Gen[R]
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,R]
    (f: (T1,T2) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,R]
    (f: (T1,T2,T3) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,R]
    (f: (T1,T2,T3,T4) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,R]
    (f: (T1,T2,T3,T4,T5) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,R]
    (f: (T1,T2,T3,T4,T5,T6) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,R]
    (f: (T1,T2,T3,T4,T5,T6,T7) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18,_:T19))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18,_:T19,_:T20))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20], a21:Arbitrary[T21]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18,_:T19,_:T20,_:T21))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20], a21:Arbitrary[T21], a22:Arbitrary[T22]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18,_:T19,_:T20,_:T21,_:T22))
    }
  
}