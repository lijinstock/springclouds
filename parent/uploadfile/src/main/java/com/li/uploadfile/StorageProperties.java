/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/31 16:05
 */

package com.li.uploadfile;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

@ConfigurationProperties("storage")
@Repository
public class StorageProperties {


    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
