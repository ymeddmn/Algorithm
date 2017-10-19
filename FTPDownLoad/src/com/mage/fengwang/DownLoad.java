package com.mage.fengwang;

public class DownLoad {
    public static boolean downloadFile(String url, int port, String username, String password, String remotePath,
                                       String fileName, String localPath)
    {
        boolean success = false;
        FTPClient ftp = new FTPClient();
        try
        {
            int reply;

            // 连接FTP服务器
            if (port > -1)
            {
                ftp.connect(url, port);
            }
            else
            {
                ftp.connect(url);
            }

            ftp.login(username, password);//登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply))
            {
                ftp.disconnect();
                return success;
            }
            ftp.changeWorkingDirectory(remotePath);//转移到FTP服务器目录
            FTPFile[] fs = ftp.listFiles();
            for (FTPFile ff : fs)
            {
                if (ff.getName().equals(fileName))
                {
                    File localFile = new File(localPath + "/" + ff.getName());

                    OutputStream is = new FileOutputStream(localFile);
                    ftp.retrieveFile(ff.getName(), is);
                    is.close();
                }
            }

            ftp.logout();
            success = true;
        }
        catch (IOException e)
        {
            logger.error(EXCEPTION_NAME, e);
        }
        finally
        {
            if (ftp.isConnected())
            {
                try
                {
                    ftp.disconnect();
                }
                catch (IOException e)
                {
                    logger.error(EXCEPTION_NAME, e);
                }
            }
        }
        return success;
    }
}
