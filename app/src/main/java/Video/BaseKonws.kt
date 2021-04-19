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
 *      MP4格式分析
 *
 *
 *
 *      H.264/AVC视频编码标准
 *          *视频编码层面（VCL）
 *              -视频数据的内容
 *          *网络抽象层面（NAL）
 *              -格式化数据并提供头信息
 *
 *
 *      GOP:两个I帧之间的距离。
 *      在视频编码序列中，主要有三种帧，I帧，P帧，B帧。
 *          1 I（intra-coded picture）帧内编码图像帧。不参考其他图像帧，只利用本帧的图像进行编码。
 *          2 P (Predictive-code picture) 预测编码图像帧，利用之前的I帧和P帧，采用运动预测的方式
 *          进行帧间预测编码。
 *          3 B (Bidirectionally predictive picture) 双向预测编码图像帧，提供最高的压缩比，它既需要
 *          之前的图像帧。也需要后来的图像帧P帧。采用运动的方式进行帧间双向预测编码。
 *          字节数： I > P　> B
 *
 *
 *
 *
 */
