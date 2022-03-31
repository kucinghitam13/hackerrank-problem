package list

import (
	"bufio"
	"fmt"
)

type DoublyLinkedListNode struct {
	data int32
	next *DoublyLinkedListNode
	prev *DoublyLinkedListNode
}

type DoublyLinkedList struct {
	head *DoublyLinkedListNode
	tail *DoublyLinkedListNode
}

func (doublyLinkedList *DoublyLinkedList) insertNodeIntoDoublyLinkedList(nodeData int32) {
	node := &DoublyLinkedListNode{
		next: nil,
		prev: nil,
		data: nodeData,
	}

	if doublyLinkedList.head == nil {
		doublyLinkedList.head = node
	} else {
		doublyLinkedList.tail.next = node
		node.prev = doublyLinkedList.tail
	}

	doublyLinkedList.tail = node
}

func printDoublyLinkedList(node *DoublyLinkedListNode, sep string, writer *bufio.Writer) {
	for node != nil {
		fmt.Fprintf(writer, "%d", node.data)

		node = node.next

		if node != nil {
			fmt.Fprintf(writer, sep)
		}
	}
}

/*
 * Complete the 'sortedInsert' function below.
 *
 * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_DOUBLY_LINKED_LIST llist
 *  2. INTEGER data
 */

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     data int32
 *     next *DoublyLinkedListNode
 *     prev *DoublyLinkedListNode
 * }
 *
 */

func sortedInsert(llist *DoublyLinkedListNode, data int32) *DoublyLinkedListNode {
	new := &DoublyLinkedListNode{
		data: data,
	}
	current := llist
	for {
		if new.data <= current.data {
			new.next = current
			if oldPrev := current.prev; oldPrev != nil {
				new.prev = oldPrev
				oldPrev.next = new
			} else {
				llist = new
			}
			current.prev = new
			break
		} else if current.next == nil {
			new.prev = current
			current.next = new
			break
		}
		current = current.next
	}
	return llist
}
