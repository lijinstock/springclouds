/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/31 16:13
 */

package com.li.uploadfile;

public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }

}
