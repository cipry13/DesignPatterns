package com.ch.designpatterns.creational.factorymethod

interface Document {
    fun showDocumentInfo()
}

class DrawingDocument : Document {
    override fun showDocumentInfo() {
        println("This is a drawing document")
    }
}

class WordDocument : Document {
    override fun showDocumentInfo() {
        println("This is a word document")
    }
}

abstract class Application {
    abstract fun createDocument(): Document

    companion object {
        fun getApplicationDocument(documentType: DocumentType): Application {
            return when (documentType) {
                DocumentType.Drawing -> DrawingApplication()
                DocumentType.Word -> WordApplication()
            }
        }
    }
}

class DrawingApplication : Application() {
    override fun createDocument() = DrawingDocument()
}

class WordApplication : Application() {
    override fun createDocument() = WordDocument()
}

enum class DocumentType { Drawing, Word }

fun main() {
    val drawingApplication = Application.getApplicationDocument(DocumentType.Drawing)
    val drawingDocument = drawingApplication.createDocument()
    drawingDocument.showDocumentInfo()

    val wordApplication = Application.getApplicationDocument(DocumentType.Word)
    val wordDocument = wordApplication.createDocument()
    wordDocument.showDocumentInfo()
}