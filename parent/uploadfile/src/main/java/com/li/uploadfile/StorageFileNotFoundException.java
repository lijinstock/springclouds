/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/31 16:14
 */

package com.li.uploadfile;

public class StorageFileNotFoundException extends StorageException {


    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
