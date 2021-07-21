package Q92;



public class q92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count=1;
        ListNode listNode=null;
//        ListNode previous=null;
        ListNode newone=listNode;
//        ListNode next=null;
        ListNode copyhead=head;
        if (n==m){
            return head;
        }
        if (n-m==1){
            while(copyhead.next!=null){
                if (count==m-1){
                    int a=copyhead.next.val;
                    copyhead.next.val=copyhead.next.next.val;
                    copyhead.next.next.val=a;
                    count=1;
                    return copyhead;
                }

                copyhead=copyhead.next;
                count+=1;
            }
            return copyhead;
        }
        while(copyhead.next!=null){

            if (count==m-1){
                listNode=copyhead;
            }
            if (count==n){
//                while (head.next!=null){
//                    if (count==m-1){
//                        head.val=listNode.val;
//                    }
//                    head=head.next;
//                    count=1;
//                }

                count=1;
                break;
            }
//            while (listNode!=null){
//                listNode=listNode.next;
//            }
            count+=1;
            copyhead=copyhead.next;
        }

//        while (newone!=null){
//            next=newone.next;
//        }

//        System.out.println(count);

        return listNode;
    }
}
