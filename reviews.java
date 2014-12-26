/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Basma
 */
public class reviews {
    public String u_review,like_r,comment_r;

    public void setu_review(String u_review) {
        this.u_review = u_review;
    }

    public void setcomment_r(String comment_r) {
        this.comment_r = comment_r;
    }

    public void setlike_r(String like_r) {
        this.like_r = like_r;
    }

    public String getu_review() {
        return u_review;
    }

    public String getcomment_r() {
        return comment_r;
    }

    public String getlike_r() {
        return like_r;
    }

    void review(){} 
    
    void comment(){}
    
    void like(){}
    
}


