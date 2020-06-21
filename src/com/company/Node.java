package com.company;

public class Node<E> {
	Node<E> row;
	Node<E> column;
	Node<E> preRow;
	Node<E> preColumn;
	E data;

	public Node(Node<E> row, Node<E> column, Node<E> preRow, Node<E> preColumn, E data) {
		this.row = row;
		this.column = column;
		this.preRow = preRow;
		this.preColumn = preColumn;
		this.data = data;
	}

}
