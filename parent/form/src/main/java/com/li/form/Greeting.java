/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/28 12:34
 */

package com.li.form;

public class Greeting {

    private Long id;

    private String context;

    public Greeting() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Greeting(Long id, String context) {
        this.id = id;
        this.context = context;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", context='" + context + '\'' +
                '}';
    }
}
