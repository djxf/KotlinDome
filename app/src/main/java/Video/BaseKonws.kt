package Video

/**
 *
 * 音视频基础
 *      *MPEG-4 是一套用于音频视频，视频信息的压缩编码标准。
 *      常用封装格式：
 *              * AVI 压缩标准可任意选择
 *              * FLV ts 流媒体格式
 *              * ASF
 *              * mp4
 *      常用编码格式：
 *              * 视频 H264， wmv， mjpeg，XviD
 *              * 音频 acc，MP3，ape，flac。
 *
 *      封装格式和编码格式：
 *          ---------
 *          - 封装   -
 *          - 格式   -.....视频编码帧，音频编码帧.....
 *          - 头     -                 (解码为PCM FLT)
 *          ---------
 *
 *      图像像素格式
 *          * RGB，YUA420
 *          * YUV: Y表示明亮度， 也就是灰度值。U，V表示色度。
 *
 *
 *      PCM音频参数
 *          * 采样率　sample＿rate 44100 (CD)
 *          * 通道 channels 左右声道。
 *          * 样本大小 simple_size
 *              --AV_SAMPLE_FMT_S16
 *              --AV_SAMPLE_FMT_FLTP
 *
 *
 *
 *
 *
 *
 */
