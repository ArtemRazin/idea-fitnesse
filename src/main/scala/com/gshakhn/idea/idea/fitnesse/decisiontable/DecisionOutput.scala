package com.gshakhn.idea.idea.fitnesse.decisiontable

import com.gshakhn.idea.idea.fitnesse.lang.psi.{Cell, MethodReferences}
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiMethod
import fitnesse.testsystems.slim.tables.Disgracer._

class DecisionOutput(node: ASTNode) extends Cell(node) with MethodReferences {

  override def fixtureMethodName = disgraceMethodName(node.getText.trim)

  override def createReference(psiMethod: PsiMethod) = new DecisionOutputReference(psiMethod, this)
}