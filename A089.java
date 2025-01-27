import DS.TreeNode;

import java.util.Arrays;

public class A089 {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=new TreeNode(-999);
        addArray(nums,root);
        return root;
    }

    void addArray(int[] nums, TreeNode root){
        if(nums.length<3){
            addNode(root,new TreeNode(nums[0]));
            if(nums.length>1) addNode(root,new TreeNode(nums[1]));
            return;
        }
        int[] l= Arrays.copyOfRange(nums,0,nums.length/2);
        int[] r=Arrays.copyOfRange(nums,nums.length/2+1,nums.length);
        addNode(root, new TreeNode(nums[nums.length/2]));
        addArray(l,root);
        addArray(r,root);
    }

    void addNode(TreeNode root, TreeNode x){
        if(root.val==-999){
            root.val=x.val;
            return;
        }
        if(root.val>x.val){
            if(root.left==null){
                root.left=x;
                return;
            }
            else addNode(root.left,x);
        }
        else{
            if(root.right==null){
                root.right=x;
                return;
            }
            else addNode(root.right,x);
        }
    }
}
